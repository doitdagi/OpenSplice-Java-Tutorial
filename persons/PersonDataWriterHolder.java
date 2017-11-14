package persons;

public final class PersonDataWriterHolder
{

    public persons.PersonDataWriter value = null;

    public PersonDataWriterHolder()
    {
    }

    public PersonDataWriterHolder(persons.PersonDataWriter initialValue)
    {
        value = initialValue;
    }

}
