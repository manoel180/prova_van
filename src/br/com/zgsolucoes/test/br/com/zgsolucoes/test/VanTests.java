package br.com.zgsolucoes.test;

import br.com.zgsolucoes.Van;
import org.junit.jupiter.api.Test;


public class VanTests {


    @Test
    public void averageVelocity() {
                    Van van = new Van();

            van.validateVelocity(new Integer[]{1, 40, 10, 1});
            van.validateVelocity(new Integer[]{20, 21, 21});
            van.validateVelocity(new Integer[]{1, 40, 10, 5});
            van.validateVelocity(new Integer[]{20, 20, 20});
            van.validateVelocity(new Integer[]{1, 20, 10, 50});
            van.validateVelocity(new Integer[]{10, 14, 15});
            van.validateVelocity(new Integer[]{5, 1000, 2, 5});
            van.validateVelocity(new Integer[]{400, 30, 80});
            van.validateVelocity(new Integer[]{600, 35, 50});
            van.validateVelocity(new Integer[]{700, 10, 30});
            van.validateVelocity(new Integer[]{900, 30, 40});
            van.validateVelocity(new Integer[]{950, 10, 30});
            van.validateVelocity(new Integer[]{-1, -1, -1, -1});

    }

}
