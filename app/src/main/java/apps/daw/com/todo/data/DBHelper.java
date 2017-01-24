package apps.daw.com.todo.data;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import apps.daw.com.todo.dao.ToDoContract;

/**
 * Created by Dan on 1/24/2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "todo.db";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_TODO =
            "CREATE TABLE " + ToDoContract.ToDoEntry.TABLE_NAME + " (" +
                    ToDoContract.ToDoEntry._ID + " INTEGER PRIMARY KEY," +
                    ToDoContract.ToDoEntry.COLUMN_NAME_TASK + " TEXT," +
                    ToDoContract.ToDoEntry.COLUMN_NAME_COMPLETED + " INTEGER)";

    public static final String SQL_DELETE_TODO =
            "DROP TABLE IF EXISTS " + ToDoContract.ToDoEntry.TABLE_NAME;

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_TODO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DELETE_TODO);
    }
}
