package com.viveksamele.notes.Activity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.viveksamele.notes.Adapter.NoteRecyclerrAdapter;
import com.viveksamele.notes.NotesDbAdapter;
import com.viveksamele.notes.R;

/**
 * Created by GeeK on 7/24/2016.
 */
public class ListActivity extends Activity {
    private static final int ACTIVITY_CREATE = 0;
    private static final int ACTIVITY_EDIT = 1;

    private static final int DELETE_ID = Menu.FIRST;
    private int mNoteNumber = 1;

    private NotesDbAdapter mDbHelper;
    private NoteRecyclerrAdapter noteRecyclerrAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note_list);
        mDbHelper = new NotesDbAdapter(this);
        mDbHelper.open();
        bindNotesList();

    }

    @Override
    protected void onResume() {
        super.onResume();
        //for refreshing list temp
        bindNotesList();
        //noteRecyclerrAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.notelist_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuAddNote:
                createNote();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void createNote() {
        Intent i = new Intent(this, EditableNoteActivity.class);
        startActivityForResult(i, ACTIVITY_CREATE);
    }

    /**
     * bind the list
     */
    private void bindNotesList() {
        // Get all of the notes from the database and create the item list
        Cursor notesCursor = mDbHelper.fetchAllNotes();
        if (notesCursor != null) {
              noteRecyclerrAdapter = new NoteRecyclerrAdapter(notesCursor);


            RecyclerView notListView = (RecyclerView) findViewById(R.id.noteRecyclerView);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            notListView.setLayoutManager(linearLayoutManager);
            notListView.setAdapter(noteRecyclerrAdapter);

        }
    }


}
