package com.shri.neuralnet.functions.activation.impl;

import com.shri.neuralnet.functions.activation.ActivationFunction;

public class GaussianFunction implements ActivationFunction {

    @Override
    public Double calculate(Double input) {
        return Math.exp(-Math.pow(input, 2));
    }

}
