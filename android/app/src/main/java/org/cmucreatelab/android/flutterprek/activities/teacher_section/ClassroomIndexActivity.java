package org.cmucreatelab.android.flutterprek.activities.teacher_section;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;

import org.cmucreatelab.android.flutterprek.R;
import org.cmucreatelab.android.flutterprek.activities.adapters.ClassroomIndexAdapter;
import org.cmucreatelab.android.flutterprek.activities.fragments.DrawerTeacherMainFragment;
import org.cmucreatelab.android.flutterprek.database.AppDatabase;
import org.cmucreatelab.android.flutterprek.database.models.classroom.Classroom;

import java.util.List;

public class ClassroomIndexActivity extends TeacherSectionActivityWithHeaderAndDrawer {


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

        FloatingActionButton fabNewClassroom = findViewById(R.id.fabNewClassroom);
        fabNewClassroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("activity", "fabNewClassroom.onClick");
            }
        });
    }


    @Override
    public DrawerTeacherMainFragment.Section getSectionForDrawer() {
        return DrawerTeacherMainFragment.Section.ACTIVE_CLASS;
    }


    @Override
    public int getResourceIdForActivityLayout() {
        return R.layout._teacher_section__activity_classrooms_index;
    }

}
