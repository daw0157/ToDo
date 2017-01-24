package apps.daw.com.todo.dao;

import android.provider.BaseColumns;

/**
 * Created by Dan on 1/24/2017.
 */

public final class ToDoContract {

    private ToDoContract(){}

    public static class ToDoEntry implements BaseColumns {
        public static final String TABLE_NAME = "todo";
        public static final String COLUMN_NAME_TASK = "task";
        public static final String COLUMN_NAME_COMPLETED = "completed";
    }

}
