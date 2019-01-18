package net.fux.service.impl;

import net.fux.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuxj on 2019/1/18 0018.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
