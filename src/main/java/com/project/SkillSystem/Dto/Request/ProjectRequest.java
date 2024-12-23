package com.project.SkillSystem.Dto.Request;

import com.project.SkillSystem.Enum.Profile.ProfileRole;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectRequest {
    String title;

    Date startDate;

    Date endDate;

    String client;

    String description;

    Long teamSize;

    ProfileRole role;

    Long skillId;

    String profileId;
}
