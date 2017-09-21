package me.hltj.java9demo.lombok;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Value
@ToString
class Language {
    @NonNull
    private String name;
    private int version;
}

@Slf4j
public class LombokDemo {
    public static void main(String[] args) {
        val version = Integer.parseInt(System.getProperty("java.version"));

        val java = new Language("Java", version);

        log.info("Hello Lombok in {}.", java);
    }
}
