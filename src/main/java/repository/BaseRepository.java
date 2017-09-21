package repository;

import org.jooq.InsertValuesStep;
import org.jooq.Record;
import org.jooq.Table;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static config.DbFactory.getFactory;

/**
 * Created by framgia on 21/09/2017.
 */
public abstract class BaseRepository<T> {

    private static final int MAX_SIZE_PER_BATCH = 100;

    public List<List<T>> split(List<T> records, Integer size) {
        int recordsSize = records.size();
        int maxSize = (recordsSize + size - 1) / size;
        List<List<T>> batches = new ArrayList<>(maxSize);

        for(int start=0; start < recordsSize; start+= size) {
            batches.add(records.subList(start, Math.min(recordsSize, start + size)));
        }

        return batches;
    }

    public List<List<T>> split(List<T> records) {
        return split(records, MAX_SIZE_PER_BATCH);
    }

    public abstract Table getTable();

    public void insertBatch(List<T> records) throws SQLException {
        InsertValuesStep insertQuery = getFactory().insertInto(getTable(), getTable().getFields());
        records.stream().forEach(record -> insertQuery.values(createValues(record)));
        insertQuery.execute();
    }


    public List<Object> createValues(T record) {
        List<Object> values = new ArrayList<>();
        // TODO
        // create values from record
        return values;
    }

    public void insert(T record) {};
    /*
      protected void insertBatch(List<Record> abnormals) {
        InsertValuesStep<E> insertErrQuery = asiagate.insertInto(err.table(), err.table().getFields());
        abnormals.stream().forEach(record -> insertErrQuery.values(createValues(record)));
        insertErrQuery.execute();
    }
     */
}
