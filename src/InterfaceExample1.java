interface camera
{
    void click();
    void record();
}

interface musicplayer
{
    void play();
    void pause();
}

interface browse
{
    void browse1();
}

class phone
{
    void call()
    {
        System.out.println("Calling...");
    }
    void message()
    {
        System.out.println("Messaging...");
    }
}


class smartphone extends phone implements camera,musicplayer,browse
{
    public int k=5;
    public int totaloptions()
    {
        return k;
    }
    @Override
    public void click() {System.out.println("Clicked a snap");}
    @Override
    public void record() {System.out.println("Started recording");}
    @Override
    public void play() {System.out.println("Musicplayer is playing");}
    @Override
    public void pause() {System.out.println("Musicplayer is stopped");}
    @Override
    public void browse1() {System.out.println("Entering WWW.Google.com");}
}

public class InterfaceExample1
{
    public static void main(String arg[])
    {
        phone c = new smartphone();
        c.call();
        c.message();

        smartphone c1 = new smartphone();
        System.out.println(c1.totaloptions());

        camera c2 = c1;
        c2.click();
        c2.record();

    }
}
