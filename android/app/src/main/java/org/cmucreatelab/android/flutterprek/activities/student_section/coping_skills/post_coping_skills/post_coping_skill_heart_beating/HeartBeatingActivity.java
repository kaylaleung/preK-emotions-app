package org.cmucreatelab.android.flutterprek.activities.student_section.coping_skills.post_coping_skills.post_coping_skill_heart_beating;

import org.cmucreatelab.android.flutterprek.R;
import org.cmucreatelab.android.flutterprek.activities.student_section.coping_skills.post_coping_skills.PostCopingSkillActivity;

public class HeartBeatingActivity extends PostCopingSkillActivity {


    @Override
    public String getAudioFileForPostCopingSkillTitle() {
        return "etc/audio_prompts/audio_heart_beating_how_fast.wav";
    }


    @Override
    public int getResourceIdForActivityLayout() {
        return R.layout._coping_skill__activity_heart_beating;
    }


}
