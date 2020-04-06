package com.github.curriculeon.greeps;

import com.github.curriculeon.greeps.Earth;
import com.github.git_leon.jfoot.system.JFootApplication;
import greenfoot.Greenfoot;
import greenfoot.World;
import greenfoot.core.WorldHandler;
import org.junit.Test;

public class DemoAppTest {
    @Test
    public void test() {
        test(new Earth(), 50, 60000);
    }

    private void test(World world, Integer simulationSpeed, Integer totalSimulationTime) {
        try {
            new JFootApplication().run();
            Greenfoot.setWorld(world);
            Greenfoot.setSpeed(simulationSpeed);
            Thread.sleep(totalSimulationTime);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
