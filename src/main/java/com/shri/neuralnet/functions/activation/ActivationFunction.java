package com.shri.neuralnet.functions.activation;

import com.shri.neuralnet.functions.activation.impl.ArcTanFunction;
import com.shri.neuralnet.functions.activation.impl.BentIdentityFunction;
import com.shri.neuralnet.functions.activation.impl.BinaryStepFunction;
import com.shri.neuralnet.functions.activation.impl.GaussianFunction;
import com.shri.neuralnet.functions.activation.impl.IdentityFunction;
import com.shri.neuralnet.functions.activation.impl.LeakyReLUFunction;
import com.shri.neuralnet.functions.activation.impl.ReLUFunction;
import com.shri.neuralnet.functions.activation.impl.SigmoidFunction;
import com.shri.neuralnet.functions.activation.impl.SinCFunction;
import com.shri.neuralnet.functions.activation.impl.SinusoidFunction;
import com.shri.neuralnet.functions.activation.impl.SoftPlusFunction;
import com.shri.neuralnet.functions.activation.impl.SoftSignFunction;
import com.shri.neuralnet.functions.activation.impl.TanHFunction;

public interface ActivationFunction
{

    ActivationFunction ARC_TAN = new ArcTanFunction();

    ActivationFunction BENT_IDENTITY = new BentIdentityFunction();

    ActivationFunction BINARY_STEP = new BinaryStepFunction();

    ActivationFunction GAUSSIAN = new GaussianFunction();

    ActivationFunction IDENTITY = new IdentityFunction();

    ActivationFunction LEAKY_RELU = new LeakyReLUFunction();

    ActivationFunction RELU = new ReLUFunction();

    ActivationFunction SIGMOID = new SigmoidFunction();

    ActivationFunction SIN_C = new SinCFunction();

    ActivationFunction SIN = new SinusoidFunction();

    ActivationFunction SOFT_PLUS = new SoftPlusFunction();

    ActivationFunction SOFT_SIGN = new SoftSignFunction();

    ActivationFunction TAN_H = new TanHFunction();

    Double calculate(Double input);

}
