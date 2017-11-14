package persons;

public interface PersonDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            persons.Person instance_data);

    long register_instance_w_timestamp(
            persons.Person instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            persons.Person instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            persons.Person instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            persons.Person instance_data, 
            long handle);

    int write_w_timestamp(
            persons.Person instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            persons.Person instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            persons.Person instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            persons.Person instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            persons.Person instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            persons.PersonHolder key_holder, 
            long handle);
    
    long lookup_instance(
            persons.Person instance_data);

}
