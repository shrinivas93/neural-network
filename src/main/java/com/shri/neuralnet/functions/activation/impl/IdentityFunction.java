package com.shri.neuralnet.functions.activation.impl;

import com.shri.neuralnet.functions.activation.ActivationFunction;

public class IdentityFunction implements ActivationFunction {

    @Override
    public Double calculate(Double input) {
        return input;
    }

}
