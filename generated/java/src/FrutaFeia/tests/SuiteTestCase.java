package FrutaFeia.tests;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class SuiteTestCase {
  protected void assertTrue(final Boolean arg) {

    return;
  }

  protected void assertFalse(final Boolean arg) {

    return;
  }

  protected void assertEqual(final Object expected, final Object actual) {

    if (!(Utils.equals(expected, actual))) {
      IO.print("Actual value (");
      IO.print(((Object) actual));
      IO.print(") different from expected (");
      IO.print(((Object) expected));
      IO.println(")\n");
    }
  }

  public SuiteTestCase() {}

  public String toString() {

    return "SuiteTestCase{}";
  }
}
