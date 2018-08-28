package com.shri.neuralnet.functions.summing.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.shri.neuralnet.components.Connection;
import com.shri.neuralnet.functions.summing.InputSummingFunction;

public class WeightedSquaredSumFunction implements InputSummingFunction {

    @Override
    public Double calculate(List<Connection> connections) {
        return connections.stream()
                .collect(Collectors.summingDouble(connection -> Math.pow(connection.getWeightedInput(), 2)));
    }

}
