package com.viveksamele.notes.Adapter;

import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viveksamele.notes.NotesDbAdapter;
import com.viveksamele.notes.R;

/**
 * Created by GeeK on 7/24/2016.
 */
public class NoteRecyclerrAdapter extends RecyclerView.Adapter<NoteItemViewHolder>{
final Cursor mCursor;

    public NoteRecyclerrAdapter(Cursor cursor) {
        this.mCursor = cursor;
        mCursor.moveToFirst();
    }

    @Override
    public NoteItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_row_item, parent, false);
        return new NoteItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NoteItemViewHolder holder, int position) {

        // Extract properties from cursor
        String title = mCursor.getString(mCursor.getColumnIndexOrThrow(NotesDbAdapter.KEY_TITLE));
        String date = mCursor.getString(mCursor.getColumnIndexOrThrow(NotesDbAdapter.KEY_DATE));
        // Populate fields with extracted properties
        holder.noteTitle.setText(title);
        holder.dateRow.setText(date);
        mCursor.moveToNext();
    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }

}
