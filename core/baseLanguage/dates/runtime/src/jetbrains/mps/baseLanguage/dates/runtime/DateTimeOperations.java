/*
 * Copyright 2003-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.baseLanguage.dates.runtime;

import org.apache.log4j.Logger;
import org.joda.time.*;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.PeriodFormatter;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Maxim.Mazin at date: 21.02.2007 time: 17:25:49
 */
public class DateTimeOperations {
    
  private static final Logger LOG = Logger.getLogger(DateTimeOperations.class);

  @Deprecated
  private static InheritableThreadLocal<DateTimeZone> currentZone = new InheritableThreadLocal<DateTimeZone> () {
      protected DateTimeZone initialValue() {
          return DateTimeZone.getDefault();
      }
  };
  
  private DateTimeOperations() {
  }

  @Deprecated
  public static String print(Long datetime, DateTimeFormatter formatter) {
    return formatter.print(datetime != null ? new DateTime(datetime, currentZone.get()) : Constants.NULL_DATE_TIME);
  }

  @Deprecated
  public static String print(Long datetime, DateTimeFormatter formatter, Locale locale) {
    return print(datetime, formatter.withLocale(locale));
  }

  @Deprecated
  public static String print(Long value, DateTimeFormatter formatter, Locale locale, DateTimeZone zone) {
    DateTime dateTime = (value != null)?
      ((zone != null)? new DateTime(value, zone) : new DateTime(value, currentZone.get())) : Constants.NULL_DATE_TIME;
    DateTimeFormatter dateTimeFormatter = (locale == null)? formatter : formatter.withLocale(locale);
    return dateTimeFormatter.print(dateTime);
  }

  public static String print(DateTime value, DateTimeFormatter formatter, Locale locale) {
    DateTime dateTime = (value != null) ? value : Constants.NULL_DATE_TIME;
    DateTimeFormatter dateTimeFormatter = (locale == null)? formatter : formatter.withLocale(locale);
    return dateTimeFormatter.print(dateTime);
  }

  public static String print(Period value, PeriodFormatter formatter, Locale locale) {
    Period period = value != null ? value : new Period();
    PeriodFormatter dateTimeFormatter = locale == null ? formatter : formatter.withLocale(locale);
    return dateTimeFormatter.print(period);
  }

  @Deprecated
  public static String print(Period period, DateTimeFormatter formatter, Locale locale, DateTimeZone zone) {
    return print(convert(period), formatter, locale, zone);
  }

  public static DateTime convert(Long l, DateTimeZone zone) {
    return l != null ? new DateTime(l,zone) : null;
  }

  public static Long convert(DateTime dateTime) {
    return dateTime != null ? dateTime.getMillis() : null;
  }

  public static Long convert(Date date) {
    return date != null ? date.getTime() : null;
  }

  public static Long convert(Calendar calendar) {
    return calendar != null ? calendar.getTimeInMillis() : null;
  }

  public static Long convert(Period period) {
    return period != null ? period.toStandardDuration().getMillis() : null;
  }

  public static Long convert(Duration period) {
    return period != null ? period.getMillis() : null;
  }

  public static Duration toDuration(Period p) {
    return p != null ? p.toStandardDuration() : null;
  }

  @Deprecated
  public static Long parse (String datetimeString, DateTimeFormatter formatter, Locale locale, DateTimeZone zone, Long defValues) {
      if (zone == null) {
          zone = currentZone.get();
      }
      if (locale != null) {
          formatter = formatter.withLocale(locale);
      }
      if (zone != null) {
          formatter = formatter.withZone(zone);
      }
      try {
          if (defValues != null) {
              MutableDateTime mdt = new MutableDateTime (defValues != null ? defValues : 0L);
              int res = formatter.parseInto(mdt, datetimeString, 0);
              if (res <= 0) {
                  // parsing error
                  LOG.debug("Error parsing the string \""+datetimeString+"\"");
                  return null;
              }
              return convert (mdt.toDateTime());
          }
          else {
              DateTime dt = formatter.parseDateTime(datetimeString);
              return convert (dt);
          }
      }
      catch (UnsupportedOperationException uoe) {
          // parsing is not supported with this formatter
          LOG.debug("Error parsing date/time ("+uoe.getMessage()+")");
      }
      catch (IllegalArgumentException iae) {
          // the string is not a datetime
          LOG.debug("Error parsing date/time ("+iae.getMessage()+")");
      }
      return null;
  }   

  public static DateTime parseDateTime(String datetimeString, DateTimeFormatter formatter, DateTimeZone zone, Locale locale, DateTime defValue) {
      if (locale != null) {
          formatter = formatter.withLocale(locale);
      }
      formatter = formatter.withZone(zone);
      try {
          if (defValue != null) {
              MutableDateTime mdt = new MutableDateTime (defValue);
              int res = formatter.parseInto(mdt, datetimeString, 0);
              if (res <= 0) {
                  // parsing error
                  LOG.debug("Error parsing the string \""+datetimeString+"\"");
                  return null;
              }
              return mdt.toDateTime();
          }
          else {
              return formatter.parseDateTime(datetimeString);
          }
      }
      catch (UnsupportedOperationException uoe) {
          // parsing is not supported with this formatter
          LOG.debug("Error parsing date/time ("+uoe.getMessage()+")");
      }
      catch (IllegalArgumentException iae) {
          // the string is not a datetime
          LOG.debug("Error parsing date/time ("+iae.getMessage()+")");
      }
      return null;
  }

  @Deprecated
  public static boolean compare(Long op1, CompareType cmp, Long op2, DateTimeFieldType type) {
    op1 = roundFloor(op1, type);
    op2 = roundFloor(op2, type);

    if (op1 == null) {
      op1 = Long.MIN_VALUE;
    }
    if (op2 == null) {
      op2 = Long.MIN_VALUE;
    }

    return compareResult(op1.compareTo(op2), cmp);
  }

  public static boolean compare(DateTime op1, CompareType cmp, DateTime op2, DateTimeFieldType type) {
    DateTimeComparator dtc = type != null ? DateTimeComparator.getInstance(type) : DateTimeComparator.getInstance();
    int compareValue;

    if(op1 == null) {
      compareValue = op2 != null ? -1 : 0;
    } else {
      compareValue = op2 != null ? dtc.compare(op1, op2) : 1;
    }

    return compareResult(compareValue, cmp);
  }

  @Deprecated
  public static Long roundFloor(Long datetime, DateTimeFieldType type) {
    return datetime != null ? new DateTime(datetime, currentZone.get()).property(type).roundFloorCopy().getMillis() : null;
  }

  public static DateTime roundFloor(DateTime datetime, DateTimeFieldType type) {
    return datetime != null ? datetime.property(type).roundFloorCopy() : null;
  }

  @Deprecated
  public static Long roundCeiling(Long datetime, DateTimeFieldType type) {
    return datetime != null ? new DateTime(datetime, currentZone.get()).property(type).roundCeilingCopy().getMillis() : null;
  }

  public static DateTime roundCeiling(DateTime datetime, DateTimeFieldType type) {
    return datetime != null ? datetime.property(type).roundCeilingCopy() : null;
  }

  @Deprecated
  public static Long round(Long datetime, DateTimeFieldType type) {
    return datetime != null ? new DateTime(datetime, currentZone.get()).property(type).roundHalfCeilingCopy().getMillis() : null;
  }

  public static DateTime round(DateTime datetime, DateTimeFieldType type) {
    return datetime != null ? datetime.property(type).roundHalfCeilingCopy() : null;
  }

  @Deprecated
  public static Integer get(Long datetime, DateTimeFieldType type) {
    return datetime != null ? new DateTime(datetime, currentZone.get()).property(type).get() : null;
  }

  public static Integer get(DateTime datetime, DateTimeFieldType type) {
    return datetime != null ? datetime.property(type).get() : null;
  }

  @Deprecated
  public static Long with(Long datetime, DateTimeFieldType type, int value) {
    return datetime != null ? new DateTime(datetime, currentZone.get()).property(type).setCopy(value).getMillis() : null;
  }

  public static DateTime with(DateTime datetime, DateTimeFieldType type, int value) {
    return datetime != null ? datetime.property(type).setCopy(value) : null;
  }

  @Deprecated
  public static Period plus(Period leftExpression, Period rightExpression) {
    if (leftExpression == null) {
      leftExpression = Period.ZERO;
    }
    if (rightExpression == null){
      rightExpression = Period.ZERO;
    }
    return new Period(
            leftExpression.getYears() + rightExpression.getYears(),
            leftExpression.getMonths() + rightExpression.getMonths(),
            leftExpression.getWeeks() + rightExpression.getWeeks(),
            leftExpression.getDays() + rightExpression.getDays(),
            leftExpression.getHours() + rightExpression.getHours(),
            leftExpression.getMinutes() + rightExpression.getMinutes(),
            leftExpression.getSeconds() + rightExpression.getSeconds(),
            leftExpression.getMillis() + rightExpression.getMillis());
  }

  @Deprecated
  public static Period minus(Period leftExpression, Period rightExpression) {
    if (leftExpression == null) {
      leftExpression = Period.ZERO;
    }
    if (rightExpression == null){
      rightExpression = Period.ZERO;
    }
    return new Period(
            leftExpression.getYears() - rightExpression.getYears(),
            leftExpression.getMonths() - rightExpression.getMonths(),
            leftExpression.getWeeks() - rightExpression.getWeeks(),
            leftExpression.getDays() - rightExpression.getDays(),
            leftExpression.getHours() - rightExpression.getHours(),
            leftExpression.getMinutes() - rightExpression.getMinutes(),
            leftExpression.getSeconds() - rightExpression.getSeconds(),
            leftExpression.getMillis() - rightExpression.getMillis());
  }

  @Deprecated
  public static Long plus(Long leftExpression, Period rightExpression) {
    Long result;
    if (leftExpression == null) {
      result = null;
    } else {
      result = new DateTime(leftExpression, currentZone.get()).plus(rightExpression).getMillis();
    }
    return result;
  }

  @Deprecated
  public static Long plus(Period left, Long right) {
    return plus(right, left);
  }

  @Deprecated
  public static Long plus(Long left, Long right) {
    return left + right;
  }

  @Deprecated
  public static Period minus(Long left, Long right) {
    return new Period(right.longValue(), left.longValue());
  }

  @Deprecated
  public static Long minus(Long leftExpression, Period rightExpression) {
    Long result;
    if (leftExpression == null) {
      result = null;
    } else {
      result = new DateTime(leftExpression, currentZone.get()).minus(rightExpression).getMillis();
    }
    return result;
  }

  @Deprecated
  public static Period minus(Long leftExpression, Long rightExpression, PeriodType periodType) {
    Period result;
    if (leftExpression == null || rightExpression == null) {
      result = null;
    } else {
      result = new Period(rightExpression, leftExpression, periodType);
    }
    return result;
  }

  @Deprecated
  public static Period absMinus(Long leftExpression, Long rightExpression, PeriodType periodType) {
    Period result;
    if (leftExpression == null || rightExpression == null) {
      result = null;
    } else {
      result = new Period(Math.min(leftExpression, rightExpression), Math.max(leftExpression, rightExpression), periodType);
    }
    return result;
  }

  public static Long never() {
    return null;
  }

  public static boolean compare(Duration op1, CompareType cmp, Period op2) {
    return compare(op1, cmp, op2 != null ? op2.toStandardDuration() : null);
  }

  public static boolean compare(Period op1, CompareType cmp, Duration op2) {
    return compare(op1 != null ? op1.toStandardDuration() : null, cmp, op2);
  }

  public static boolean compare(Long op1, CompareType cmp, Period op2) {
    return compare(op1 != null ? new Duration(op1) : null, cmp, op2 != null ? op2.toStandardDuration() : null);
  }

  public static boolean compare(Period op1, CompareType cmp, Long op2) {
    return compare(op1 != null ? op1.toStandardDuration() : null, cmp, op2 != null ? new Duration(op2) : null);
  }

  public static boolean compare(Long op1, CompareType cmp, Duration op2) {
    return compare(op1 != null ? new Duration(op1) : null, cmp, op2);
  }

  public static boolean compare(Duration op1, CompareType cmp, Long op2) {
    return compare(op1, cmp, op2 != null ? new Duration(op2) : null);
  }

  public static boolean compare(Period op1, CompareType cmp, Period op2) {
    DateTime now = new DateTime(currentZone.get());
    int compareValue;

    if(op1 == null) {
      compareValue = op2 != null ? -1 : 0;
    } else {
      compareValue = op2 != null ? op1.toDurationFrom(now).compareTo(op2.toDurationFrom(now)) : 1;
    }

    return compareResult(compareValue, cmp);
  }

  public static boolean compare(Duration op1, CompareType cmp, Duration op2) {
    int compareValue;
    if(op1 == null) {
      compareValue = op2 != null ? -1 : 0;
    } else {
      compareValue = op2 != null ? op1.compareTo(op2) : 1;
    }

    return compareResult(compareValue, cmp);
  }

  private static boolean compareResult(int compareValue, CompareType kind) {
    boolean result;
    switch (kind) {
      case EQ: result = compareValue == 0; break;
      case NE: result = compareValue != 0; break;
      case LT: result = compareValue < 0;  break;
      case GT: result = compareValue > 0;  break;
      case LE: result = compareValue <= 0; break;
      case GE: result = compareValue >= 0; break;
      default:
        throw new UnsupportedOperationException("Unsupported compare type: " + kind);
    }
    return result;
  }

  @Deprecated
  public static boolean equals(Period leftExpression, Period rightExpression) {
    boolean result;
    if (leftExpression == null || rightExpression == null) {
      result = leftExpression == rightExpression;
    } else {
      DateTime now = new DateTime(currentZone.get());
      result = leftExpression.toDurationFrom(now).equals(rightExpression.toDurationFrom(now));
    }
    return result;
  }

  @Deprecated
  public static boolean less(Period leftExpression, Period rightExpression) {
    boolean result;
    if (leftExpression == null || rightExpression == null) {
      throw new NullPointerException("Operands shouldn't be null");
    } else {
      DateTime now = new DateTime(currentZone.get());
      result = leftExpression.toDurationFrom(now).compareTo(rightExpression.toDurationFrom(now)) < 0;
    }
    return result;
  }

  public static boolean isNull(Long datetime) {
    return datetime == null;
  }

  public static boolean isNotNull(Long datetime) {
    return datetime != null;
  }

  public static boolean isNull(DateTime datetime) {
    return datetime == null;
  }

  public static boolean isNotNull(DateTime datetime) {
    return datetime != null;
  }

  public static boolean isNull(long datetime) {
    return false;
  }

  public static boolean isNotNull(long datetime) {
    return true;
  }

  @Deprecated
  public static void withTimeZone (DateTimeZone tz) {
    currentZone.set(tz);
  }

  @Deprecated
  public static DateTimeZone getCurrentTimeZone () {
      return currentZone.get();
  }
}
