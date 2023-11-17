package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.OS;
import web.model.Phone;
import web.service.PhoneService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/phones")
public class PhoneController {

    @GetMapping()
    public String getPhones(@RequestParam(value = "count", defaultValue = "10", required = false) int allPhones, Model model) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Huawei P smart X", 560, 6.2, OS.android));
        phoneList.add(new Phone("Huawei P smart XS", 360, 4.2, OS.android));
        phoneList.add(new Phone("Huawei P smart XL", 660, 6.9, OS.android));
        phoneList.add(new Phone("Iphone 2", 650, 5.5, OS.ios));
        phoneList.add(new Phone("Iphone 5", 650, 5.6, OS.ios));
        phoneList.add(new Phone("Iphone 6", 650, 5.1, OS.ios));
        phoneList.add(new Phone("Iphone 7", 650, 6.5, OS.ios));
        phoneList.add(new Phone("Iphone 8", 660, 6.5, OS.ios));
        phoneList.add(new Phone("Iphone 11", 640, 6.5, OS.ios));
        phoneList.add(new Phone("Iphone 12", 650, 5.5, OS.ios));
        phoneList.add(new Phone("Nokia Ventura", 450, 3.2, OS.android));
        List<Phone> phoneList1 = PhoneService.phoneCount(phoneList, allPhones);
        model.addAttribute("phoneList", phoneList1);
        return "phones";
    }
}
