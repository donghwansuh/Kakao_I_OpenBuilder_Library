package dev.mini.kakaoiopenbuilder.skill.response.component;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleText implements Component {
    private String text;

    @JsonCreator
    public SimpleText(@JsonProperty("text") String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "SimpleText{" +
                "text='" + text + '\'' +
                '}';
    }

}
