package com.javarush.test.level25.lesson05.home01;

/**
 * Created by Админ on 26.01.2017.
 */
public class LoggingStateThread extends Thread
{
    public Thread t;
    public LoggingStateThread(Thread t)
    {
        this.t = t;
        setDaemon(true);
    }

    @Override
    public void run()
    {
        State state = this.t.getState();
        System.out.println(state);
        while (state != State.TERMINATED)
        {
            if (state != this.t.getState())
            {
                state = this.t.getState();
                System.out.println(state);
            }
        }
    }
}
