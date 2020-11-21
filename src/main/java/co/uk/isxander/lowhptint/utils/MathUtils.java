package co.uk.isxander.lowhptint.utils;

public class MathUtils {

    /**
     * Clamps value between 0 and 1 and returns value.
     */
    public static float clamp01(float value) {
        if ((double)value < 0.0)
            return 0.0f;
        return (double)value > 1.0 ? 1f : value;
    }

    /**
     * Linearly interpolates between a and b by t.
     *
     * @param a Start value
     * @param b End value
     * @param t Interpolation between two floats
     * @return interpolated value between a - b
     */
    public static float lerp(float a, float b, float t) {
        return a + (b - a) * MathUtils.clamp01(t);
    }

    /**
     * Returns number between 0 - 1 depending on the range and value given
     *
     * @param val the value
     * @param min minimum of what the value can be
     * @param max maximum of what the value can be
     * @return converted percentage
     */
    public static float getPercent(float val, float min, float max) {
        return (val - min) / (max - min);
    }

}
