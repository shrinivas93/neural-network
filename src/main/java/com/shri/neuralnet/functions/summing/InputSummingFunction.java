package com.shri.neuralnet.functions.summing;

import java.util.List;

import com.shri.neuralnet.components.Connection;

public interface InputSummingFunction {

    Double calculate(List<Connection> connections);

}
