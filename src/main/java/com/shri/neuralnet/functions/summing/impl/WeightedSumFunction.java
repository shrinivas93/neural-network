package com.shri.neuralnet.functions.summing.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.shri.neuralnet.components.Connection;
import com.shri.neuralnet.functions.summing.InputSummingFunction;

public class WeightedSumFunction implements InputSummingFunction {

    @Override
    public Double calculate(List<Connection> connections) {
        return connections.stream().collect(Collectors.summingDouble(Connection::getWeightedInput));
    }

}
