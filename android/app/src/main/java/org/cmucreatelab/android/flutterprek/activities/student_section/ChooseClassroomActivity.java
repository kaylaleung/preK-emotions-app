package org.cmucreatelab.android.flutterprek.activities.student_section;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.GridView;

import org.cmucreatelab.android.flutterprek.R;
import org.cmucreatelab.android.flutterprek.activities.AbstractActivity;
import org.cmucreatelab.android.flutterprek.activities.adapters.ClassroomIndexAdapter;
import org.cmucreatelab.android.flutterprek.database.AppDatabase;
import org.cmucreatelab.android.flutterprek.database.models.classroom.Classroom;

import java.util.List;

public class ChooseClassroomActivity extends AbstractActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppDatabase.getInstance(this).classroomDAO().getAllClassrooms().observe(this, new Observer<List<Classroom>>() {
            @Override
            public void onChanged(@Nullable List<Classroom> classrooms) {
                GridView classroomsGridView = findViewById(R.id.classroomsGridView);
                classroomsGridView.setAdapter(new ClassroomIndexAdapter(classrooms));
            }
        });
    }


    @Override
    public int getResourceIdForActivityLayout() {
        return R.layout.activity_choose_classroom;
    }

}
