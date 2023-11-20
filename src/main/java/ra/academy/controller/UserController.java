package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import ra.academy.dto.UserDto;
import ra.academy.model.User;
import ra.academy.service.UploadService;
import ra.academy.service.serviceimpl.UserService;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UploadService uploadService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }


    @RequestMapping("/userhome")
    public String showUser(Model model) {
        model.addAttribute("list", userService.findAll());
        return "user";
    }


    @RequestMapping("/add-user")
    public ModelAndView addUser() {
        return new ModelAndView("add-user", "user", new User());
    }


    @PostMapping("/addingUser")
    public String addingUser(
            @RequestParam List<MultipartFile> avatar, @ModelAttribute UserDto userDto)  {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date utilDate = null;
        try {
            utilDate = dateFormat.parse(userDto.getBirthday());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        User user = new User(userDto.getName(), userDto.getEmail(), userDto.getAge(), sqlDate, uploadService.uploadFileToServer(avatar).toString(), userDto.getSlogan());
        userService.save(user);

        return "redirect:/userhome";
    }


}
