package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , NoticeDialogFragment.NoticeDialogListener {//, PopupMenu.OnMenuItemClickListener {


    private ActionMode mActionMode;
    private static final String TAG = "MainActivityTag" ;
    private View.OnClickListener mCorkyListener = v -> {
        Toast.makeText(getApplication(), "Event Listeners", Toast.LENGTH_LONG).show();
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// sending button for Using an OnClickListener
//###########################################################

//        Button btn_ex =  findViewById(R.id.button_send);
//        btn_ex.setOnClickListener(new View.OnClickListener() {
//                                      @Override
//                                      public void onClick(View v) {
//                                          Log.i(TAG, "Button is clicked");
//                                          Toast.makeText(getApplication(), getString(R.string.click), Toast.LENGTH_LONG).show();
//                                      }
//                                  });


// Search Box for Responding to action button events
//###########################################################

//        EditText editText = findViewById(R.id.search);
//        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                boolean handled = false;
//                if (actionId == EditorInfo.IME_ACTION_SEND){
//                    sendMessage();
//                    handled = true;
//                }
//                return handled;
//            }
//        });


// AutoCompleteTextView part of Providing Auto-complete Suggestions
//###########################################################

//        AutoCompleteTextView textView = findViewById(R.id.autocomplete_country);
//        String[]  countries = getResources().getStringArray(R.array.country_array);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , countries);
//        textView.setAdapter(adapter);


// Responding to Button Presses for ToggleButton
//###########################################################

//        ToggleButton toggleButton = findViewById(R.id.togglebutton);
//        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked)
//                    Toast.makeText(getApplication(), "toggle is enabled", Toast.LENGTH_LONG).show();
//                else
//                    Toast.makeText(getApplication(), "toggle is disabled", Toast.LENGTH_LONG).show();
//
//            }
//        });


// Populate the Spinner with User Choices
//###########################################################

//        Spinner spinner = findViewById(R.id.planets_spinner);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this , R.array.planet_array , android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);


// Event Listener
//###########################################################

//        Button btn =  findViewById(R.id.corky);
////    choose on of the below:
//        btn.setOnClickListener(mCorkyListener);
////        btn.setOnClickListener(this);


// Action mode
//###########################################################

//        Button btn = findViewById(R.id.btnShow);
//        registerForContextMenu(btn);
//        btn.setOnLongClickListener(new View.OnLongClickListener() {
//            // Called when the user long-clicks on btn
//            @Override
//            public boolean onLongClick(View v) {
//                if(mActionMode != null){
//                    return false;
//                }
//                // Start the contextual action bar
//                // using the ActionMode.Callback.
//                mActionMode = MainActivity.this.startActionMode(mActionModeCallback);
//                v.setSelected(true);
//                return true;
//            }
//        });


// Handling click events in popup menu
//        uncomment the  PopupMenu.OnMenuItemClickListener { above in decalation MainActivity
//        and also uncomment the onMenuItemClick which is overrided below
//###########################################################

//        ImageButton btn = findViewById(R.id.popup_button);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                PopupMenu popup = new PopupMenu(MainActivity.this, v);
//                popup.setOnMenuItemClickListener(MainActivity.this::onMenuItemClick);
//                popup.inflate(R.menu.reply);
//                popup.show();
//            }
//        });


// AlertDialog.Builder example
//###########################################################

//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage(R.string.dialog_message).setTitle(R.string.alert_title);
//        AlertDialog dialog = builder.create();
//        dialog.show();


// AlertDialog.Builder with button example
//###########################################################

//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setPositiveButton(R.string.ok, (dialog, which) -> Toast.makeText(getApplication(), "OK", Toast.LENGTH_SHORT).show());
//        builder.setNegativeButton(R.string.cancel, (dialog, which) -> Toast.makeText(getApplication(), "CANCEL", Toast.LENGTH_SHORT).show());
//        builder.setNeutralButton(R.string.remind_me_later, (dialog, which) -> Toast.makeText(getApplication(), "REMIND ME LATER", Toast.LENGTH_SHORT).show());
//        builder.setMessage(R.string.dialog_message).setTitle(R.string.alert_title);
//        AlertDialog dialog = builder.create();
//        dialog.show();


// Custom Layout
//###########################################################

//        DialogFragment newFragment = new CustomLayout();
//        newFragment.show(getSupportFragmentManager() , "Custom_layout");


// Basic Toast
//###########################################################

//        Context context = getApplicationContext();
//        CharSequence text = "Hello Toast!";
//        int duration = Toast.LENGTH_SHORT;
//        Toast toast = Toast.makeText(context , text , duration);
//        toast.setGravity(Gravity.TOP|Gravity.LEFT , 0 , 0);
//        toast.show();


// Creating a Custom Toast View
//###########################################################

//        LayoutInflater inflater = getLayoutInflater();
//        View layout = inflater.inflate(R.layout.custom_toast,
//                (ViewGroup) findViewById(R.id.custom_toast_container));
//
//        TextView text = (TextView) layout.findViewById(R.id.text);
//        text.setText(R.string.custom_toast);
//
//        Toast toast = new Toast(getApplicationContext());
//        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setView(layout);
//        toast.show();


// Passing Events Back to the Dialog's Host
//###########################################################
        showNoticeDialog();
    }


//    @Override
//    public boolean onMenuItemClick(MenuItem item) {
//        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
//        switch (item.getItemId()) {
//            case R.id.reply:
//                Toast.makeText(MainActivity.this,"reply",Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.replyAll:
//                Toast.makeText(MainActivity.this,"reply all",Toast.LENGTH_LONG).show();
//                return true;
//            default:
//                return false;
//        }
//    }


//    creates option menu
//###########################################################

//    public boolean onCreateOptionsMenu(Menu menu){
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.game_menu, menu);
//        return true;
//    }
//    // Handling click events in menu
//    public boolean onOptionsItemSelected(MenuItem item){
//        switch (item.getItemId()){
//            case R.id.new_game:
//                newGame();
//                return true;
//            case R.id.help:
//                showHelp();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }



//    creates context menu
//###########################################################

//    public void onCreateContextMenu(ContextMenu menu , View v , ContextMenu.ContextMenuInfo  menuInfo){
//        super.onCreateContextMenu(menu , v, menuInfo);
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.context_menu , menu);
//    }
//    public boolean onContextItemSelected(MenuItem item){
//        //????
////        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
//        switch (item.getItemId()){
//            case R.id.edit:
////                editNote(info.id);
//                return true;
//            case R.id.delete:
////                deleteNote(info.id);
//                return true;
//            default:
//                return super.onContextItemSelected(item);
//        }
//    }



    public ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            MenuInflater inflater = mode.getMenuInflater();
            inflater.inflate(R.menu.context_menu, menu);
            return true;
        }
        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false; // Return false if nothing is done
        }
        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            // Handle item click
            switch (item.getItemId()){
                case R.id.edit :
                    Toast.makeText(MainActivity.this,"Edit", Toast.LENGTH_LONG).show();
                    mode.finish();
                    return true;
                case R.id.share :
                    Toast.makeText(MainActivity.this,"Help",Toast.LENGTH_LONG).show();
                    mode.finish();
                    return true;
                case R.id.delete :
                    Toast.makeText(MainActivity.this,"Delete",Toast.LENGTH_LONG).show();
                    mode.finish();
                    return true;
                default:
                    return false;

            }

        }
        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };

//    creates group  menu
//###########################################################

//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.group_menu, menu);
//        return true;
//    }
//
//    public boolean onOptionsItemSelected(MenuItem item){
//        switch (item.getItemId()){
//            case R.id.menu_delete: {
//                if (item.isChecked())
//                    item.setChecked(false);
//                else
//                    item.setChecked(true);
//                return true;
//            }
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }



    private void deleteNote(long id) {
        Toast.makeText(getApplication(), "deleteNote ", Toast.LENGTH_LONG).show();
    }

    private void editNote(long id) {
        Toast.makeText(getApplication(), "editNote " + id, Toast.LENGTH_LONG).show();
    }

    private void showHelp() {
        Toast.makeText(getApplication(), "Help", Toast.LENGTH_LONG).show();
    }

    private void newGame() {
        Toast.makeText(getApplication(), "NEW GAME ", Toast.LENGTH_LONG).show();
    }

    void sendMessage(){
        Toast.makeText(getApplication(), getString(R.string.send), Toast.LENGTH_LONG).show();
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager() , "TimePicker");
    }

    public void showDatePickerDialog(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager() , "DatePicker");
    }

    public void onClick(View v){
        Toast.makeText(getApplication(), "Event Listeners", Toast.LENGTH_LONG).show();
    }
    public void showSingleItemDialog(View view) {
        DialogFragment newFragment = new SingleChoiceDialogFragment();
        newFragment.show(getSupportFragmentManager() , "SingleItem");
    }
    public void showFireMissionDialog(View view) {
        DialogFragment newFragment = new FireMisslesDialogFragment();
        newFragment.show(getSupportFragmentManager() , "FireMission");
    }

    public void showMultipleItemDialog(View view) {
        DialogFragment newFragment = new MultipleChoiceDialogFragment();
        newFragment.show(getSupportFragmentManager() , "MultiItem");
    }

    public void showNoticeDialog() {
        DialogFragment dialog = new NoticeDialogFragment();
        dialog.show(getSupportFragmentManager(), "NoticeDialogFragment");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        Toast.makeText(getApplication(), "Positive Click", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        Toast.makeText(getApplication(), "Negative Click", Toast.LENGTH_LONG).show();

    }



//    public void onRadioButtonClicked(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//
//        switch (view.getId()){
//            case R.id.radio_pirates:
//                if(checked)
//                    Toast.makeText(getApplication(), "Pirates are the best", Toast.LENGTH_LONG).show();
//                break;
//            case R.id.radio_ninjas:
//                if(checked)
//                    Toast.makeText(getApplication(), "Ninjas are the best", Toast.LENGTH_LONG).show();
//                break;
//        }
//    }

}






