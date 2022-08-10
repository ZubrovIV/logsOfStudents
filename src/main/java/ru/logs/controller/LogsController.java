package ru.logs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.logs.models.Logs;
import ru.logs.service.LogsService;

import java.util.List;

@RestController
@RequestMapping("/students/logs")
public class LogsController {
    private  LogsService logsService;

    @Autowired
    public LogsController(LogsService logsService) {
        this.logsService = logsService;
    }
    @GetMapping("/{name}")
    public List<Logs> getAllByStudentName(@PathVariable String name){
        return logsService.getAllByStudentName(name);
    }

    @PostMapping("/{name}")
    public Logs createLogByName (@RequestBody Logs logs,@PathVariable String name){
        logsService.creatLogByNameOfStudent(logs,name);
        return logs;
    }

}
