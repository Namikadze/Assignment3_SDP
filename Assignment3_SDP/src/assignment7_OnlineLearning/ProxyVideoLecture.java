package assignment7_OnlineLearning;

public class ProxyVideoLecture implements VideoLecture {
    private RealVideoLecture realVideoLecture;
    private String lectureName;

    public ProxyVideoLecture(String lectureName) {
        this.lectureName = lectureName;
    }

    @Override
    public void getInfo() {
        System.out.println("Video Lecture Info: " + lectureName);
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(lectureName);
        }
        realVideoLecture.play();
    }
}