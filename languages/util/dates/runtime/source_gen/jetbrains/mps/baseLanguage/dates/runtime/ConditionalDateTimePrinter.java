package jetbrains.mps.baseLanguage.dates.runtime;

/*Generated by MPS */

import org.joda.time.format.DateTimePrinter;
import java.util.List;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import java.util.Locale;
import java.io.Writer;
import java.io.IOException;
import org.joda.time.ReadablePartial;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public abstract class ConditionalDateTimePrinter implements DateTimePrinter {
  private List<DateTimePrinter> myPrinters;

  public ConditionalDateTimePrinter() {
  }

  public int estimatePrintedLength() {
    int max = 0;
    for (DateTimePrinter printer : getAllPrinters()) {
      max = Math.max(max, printer.estimatePrintedLength());
    }
    return max;
  }

  public void printTo(StringBuffer buf, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) {
    getPrinter(instant, displayOffset, displayZone, locale).printTo(buf, instant, chrono, displayOffset, displayZone, locale);
  }

  public void printTo(Writer out, long instant, Chronology chrono, int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {
    getPrinter(instant, displayOffset, displayZone, locale).printTo(out, instant, chrono, displayOffset, displayZone, locale);
  }

  public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {
    getPrinter(partial, locale).printTo(buf, partial, locale);
  }

  public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {
    getPrinter(partial, locale).printTo(out, partial, locale);
  }

  protected DateTimePrinter getPrinter(ReadablePartial partial, Locale locale) {
    return getPrinter((partial != null ?
      partial.toDateTime(null) :
      null
    ));
  }

  protected DateTimePrinter getPrinter(long instant, int displayOffset, DateTimeZone displayZone, Locale locale) {
    return getPrinter((instant != 0 ?
      new DateTime(instant - displayOffset, displayZone) :
      null
    ));
  }

  private DateTimePrinter getPrinter(DateTime dateTime) {
    int index = this.getPrinterIndex(DateTimeOperations.convert(dateTime));
    if (index >= 0) {
      List<DateTimePrinter> printers = this.getAllPrinters();
      return printers.get(index);
    } else {
      return DateTimeFormat.shortDateTime().getPrinter();
    }
  }

  private List<DateTimePrinter> getAllPrinters() {
    if (this.myPrinters == null) {
      synchronized (this) {
        if (this.myPrinters == null) {
          myPrinters = createPrinters();
        }
      }
    }
    return myPrinters;
  }

  protected abstract int getPrinterIndex(Long datetimeToFormat);

  protected abstract List<DateTimePrinter> createPrinters();
}
