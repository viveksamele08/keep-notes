package com.viveksamele.notes.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.viveksamele.notes.R;

/**
 * Created by GeeK on 7/24/2016.
 */
public class NoteItemViewHolder extends RecyclerView.ViewHolder {
    TextView noteTitle;
    TextView dateRow;

    public NoteItemViewHolder(View itemView) {
        super(itemView);
        // Find fields to populate in inflated template
        noteTitle = (TextView) itemView.findViewById(R.id.noteTitle);
        dateRow = (TextView) itemView.findViewById(R.id.dateRow);
    }
}
