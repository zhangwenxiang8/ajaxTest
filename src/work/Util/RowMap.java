package work.Util;

import java.sql.ResultSet;

public interface RowMap<E> {
        public E RowMapping(ResultSet rs);
}
