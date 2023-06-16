package com.dev.craniumproperty.repository;

import com.dev.craniumproperty.entity.Agent;
import java.util.List;
import java.util.Optional;

public interface AgentRepository {
    List<Agent> findAll();

    Optional<Agent> findById(Integer id);

    int deleteById(Integer id);

    int insert(Agent agent);

    int update(Agent agent);
}
