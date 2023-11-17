package web.service;

import web.model.Phone;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneService {

    public static List<Phone> phoneCount(List<Phone> phoneList, int limit) {
        if (limit == 0 || limit > 10) {
            return phoneList;
        }
        return phoneList.stream().limit(limit).collect(Collectors.toList());
    }
}
