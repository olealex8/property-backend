package com.dev.craniumproperty.controller;

import com.dev.craniumproperty.exception.ResourceNotFoundException;
import com.dev.craniumproperty.entity.Agent;
import com.dev.craniumproperty.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
// @RequestMapping("/api")
public class AgentController {
    @Autowired
    private AgentRepository agentRepository;

    // get all users
    @GetMapping("/agent")
    public List<Agent> getAllUsers()
    {
        return agentRepository.findAll();
    }

    // create user rest API
    @PostMapping("/agent")
    public Map<String, Boolean> createUser(@RequestBody Agent agent)  {

        Map<String, Boolean> response = new HashMap<>();

        Boolean bool = agentRepository.insert(agent) > 0 ?
                response.put("created", Boolean.TRUE) :
                response.put("created", Boolean.FALSE);

        return response;

    }

    // get user by id rest api
    @GetMapping("/agent/{id}")
    public Agent findUserById(@PathVariable Integer id) {

        Agent agent = agentRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException
                ("User not exist with id :" + id));
        return agent;
    }

   // update user rest api
   @PutMapping("/agent/{id}")
   public Map<String, Boolean> updateUser(@PathVariable Integer id, @RequestBody Agent agentDetails) {

        Agent agent = agentRepository.findById(id)
              .orElseThrow(() -> new ResourceNotFoundException
               ("User not exist with id :" + id));
               agentDetails.setId(id);
       Map<String, Boolean> response = new HashMap<>();

       Boolean bool = agentRepository.update(agentDetails) > 0 ?
               response.put("updated", Boolean.TRUE) :
               response.put("updated", Boolean.FALSE);

      return response;
    }

    // delete user rest api
    @DeleteMapping("/agent/{id}")
    public Map<String, Boolean> deleteUser
               (@PathVariable Integer id) {

                Agent agent = agentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException
                        ("User not exist with id :" + id));

        Map<String, Boolean> response = new HashMap<>();

        Boolean bool = agentRepository.deleteById(agent.getId()) > 0 ?
                response.put("deleted", Boolean.TRUE) :
                response.put("deleted", Boolean.FALSE);
        return response;
    }
}
