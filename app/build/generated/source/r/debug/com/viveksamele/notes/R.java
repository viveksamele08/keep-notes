/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.viveksamele.notes;

public final class R {
    public static final class attr {
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int layoutManager=0x7f010000;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int reverseLayout=0x7f010002;
        /** <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int spanCount=0x7f010001;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int stackFromEnd=0x7f010003;
    }
    public static final class dimen {
        public static final int item_touch_helper_max_drag_scroll_per_frame=0x7f060000;
        public static final int item_touch_helper_swipe_escape_max_velocity=0x7f060001;
        public static final int item_touch_helper_swipe_escape_velocity=0x7f060002;
    }
    public static final class drawable {
        public static final int add_note=0x7f020000;
        public static final int ic_menu_delete=0x7f020001;
        public static final int ic_menu_save=0x7f020002;
        public static final int note_header=0x7f020003;
        public static final int notelist=0x7f020004;
    }
    public static final class id {
        public static final int body=0x7f070005;
        public static final int dateRow=0x7f070007;
        public static final int item_touch_helper_previous_elevation=0x7f070000;
        public static final int menuAddNote=0x7f07000c;
        public static final int menu_about=0x7f07000b;
        public static final int menu_delete=0x7f07000a;
        public static final int menu_save=0x7f070009;
        public static final int noteRecyclerView=0x7f070008;
        public static final int noteTitle=0x7f070006;
        public static final int notelist_date=0x7f070004;
        public static final int title=0x7f070003;
        public static final int title_text1=0x7f070002;
        public static final int toplayout=0x7f070001;
    }
    public static final class layout {
        public static final int note_edit=0x7f040000;
        public static final int note_row_item=0x7f040001;
        public static final int note_list =0x7f040002;
    }
    public static final class menu {
        public static final int noteedit_menu=0x7f090000;
        public static final int notelist_menu=0x7f090001;
    }
    public static final class mipmap {
        public static final int ic_launcher=0x7f030000;
    }
    public static final class string {
        public static final int about=0x7f080000;
        public static final int add_note=0x7f080001;
        public static final int app_name=0x7f080002;
        public static final int delete_menu_noteedit=0x7f080003;
        public static final int edit_note=0x7f080004;
        public static final int hello_world=0x7f080005;
        public static final int menu_delete=0x7f080006;
        public static final int my_notes=0x7f080007;
        public static final int no_title=0x7f080008;
        public static final int save_menu_noteedit=0x7f080009;
        public static final int title=0x7f08000a;
    }
    public static final class style {
        /**  API 11 theme customizations can go here. 
 API 14 theme customizations can go here. 

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        
         */
        public static final int AppBaseTheme=0x7f050000;
        /**  All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f050001;
    }
    public static final class styleable {
        /** Attributes that can be used with a RecyclerView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #RecyclerView_android_orientation android:orientation}</code></td><td></td></tr>
           <tr><td><code>{@link #RecyclerView_layoutManager com.viveksamele.notes:layoutManager}</code></td><td></td></tr>
           <tr><td><code>{@link #RecyclerView_reverseLayout com.viveksamele.notes:reverseLayout}</code></td><td></td></tr>
           <tr><td><code>{@link #RecyclerView_spanCount com.viveksamele.notes:spanCount}</code></td><td></td></tr>
           <tr><td><code>{@link #RecyclerView_stackFromEnd com.viveksamele.notes:stackFromEnd}</code></td><td></td></tr>
           </table>
           @see #RecyclerView_android_orientation
           @see #RecyclerView_layoutManager
           @see #RecyclerView_reverseLayout
           @see #RecyclerView_spanCount
           @see #RecyclerView_stackFromEnd
         */
        public static final int[] RecyclerView = {
            0x010100c4, 0x7f010000, 0x7f010001, 0x7f010002,
            0x7f010003
        };
        /**
          <p>This symbol is the offset where the {@link android.R.attr#orientation}
          attribute's value can be found in the {@link #RecyclerView} array.
          @attr name android:orientation
        */
        public static final int RecyclerView_android_orientation = 0;
        /**
          <p>This symbol is the offset where the {@link com.viveksamele.notes.R.attr#layoutManager}
          attribute's value can be found in the {@link #RecyclerView} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.viveksamele.notes:layoutManager
        */
        public static final int RecyclerView_layoutManager = 1;
        /**
          <p>This symbol is the offset where the {@link com.viveksamele.notes.R.attr#reverseLayout}
          attribute's value can be found in the {@link #RecyclerView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.viveksamele.notes:reverseLayout
        */
        public static final int RecyclerView_reverseLayout = 3;
        /**
          <p>This symbol is the offset where the {@link com.viveksamele.notes.R.attr#spanCount}
          attribute's value can be found in the {@link #RecyclerView} array.


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.viveksamele.notes:spanCount
        */
        public static final int RecyclerView_spanCount = 2;
        /**
          <p>This symbol is the offset where the {@link com.viveksamele.notes.R.attr#stackFromEnd}
          attribute's value can be found in the {@link #RecyclerView} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.viveksamele.notes:stackFromEnd
        */
        public static final int RecyclerView_stackFromEnd = 4;
    };
}
