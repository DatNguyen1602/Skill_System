package com.project.SkillSystem.Repository;

import com.project.SkillSystem.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByProfileId(String profileId);

    void deleteByProfileId(String profileId);
}
