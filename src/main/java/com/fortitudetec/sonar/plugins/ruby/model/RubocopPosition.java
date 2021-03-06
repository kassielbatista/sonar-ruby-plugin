package com.fortitudetec.sonar.plugins.ruby.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class RubocopPosition {
    private int line;
    private int character;
}
