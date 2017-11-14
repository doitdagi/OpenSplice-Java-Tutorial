package persons;

import org.opensplice.dds.dcps.Utilities;

public final class PersonDataReaderViewHelper
{

    public static persons.PersonDataReaderView narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof persons.PersonDataReaderView) {
            return (persons.PersonDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

    public static persons.PersonDataReaderView unchecked_narrow(java.lang.Object obj)
    {
        if (obj == null) {
            return null;
        } else if (obj instanceof persons.PersonDataReaderView) {
            return (persons.PersonDataReaderView)obj;
        } else {
            throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_PARAM, null);
        }
    }

}
