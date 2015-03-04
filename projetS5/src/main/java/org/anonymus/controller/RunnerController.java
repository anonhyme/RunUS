package org.anonymus.controller;

import org.anonymus.exception.RunnerNotFound;
import org.anonymus.handler.MyHandler;
import org.anonymus.model.Runner;
import org.anonymus.service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by antoine on 3/2/2015.
 */
@Controller
@RequestMapping(value = "/runner")
public class RunnerController {
    
    @Autowired
    private RunnerService runnerService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView newRunnerPage() {
        ModelAndView mav = new ModelAndView("runner/runner-new", "runner", new Runner());
        return mav;
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createNewRunner(@ModelAttribute @Valid Runner runner, BindingResult result, final RedirectAttributes redirectAttributes) {
        ModelAndView mav = new ModelAndView();
        String message = "New user " + runner.getName() + " was successfully created.";
        runnerService.create(runner);
        mav.setViewName("redirect:/runner/list");
        redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView runnerListPage() {
        ModelAndView mav = new ModelAndView("runner/runner-list");
        List<Runner> runnerList = runnerService.findAll();
        mav.addObject("runnerList", runnerList);
        return mav;
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editRunnerPage(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("runner/runner-edit");
        Runner runner = runnerService.findById(id);
        mav.addObject("runner", runner);
        return mav;
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public ModelAndView editRunner(@ModelAttribute Runner runner, @PathVariable Integer id, BindingResult result, final RedirectAttributes redirectAttributes) throws RunnerNotFound {
        ModelAndView mav = new ModelAndView("redirect:/runner/runner-list");
        String message = "Runner was successfully updated.";
        
        runnerService.update(runner);
        mav.setViewName("redirect:/runner/list");
        
        redirectAttributes.addFlashAttribute("message", message);
        
        return mav;
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteRunner(@PathVariable Integer id, final RedirectAttributes redirectAttributes) throws RunnerNotFound {
        
        ModelAndView mav = new ModelAndView("redirect:/runner/list");
        
        Runner runner = runnerService.delete(id);
        String message = "The runner " + runner.getName() + " was successfully deleted.";
        
        redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }
}
