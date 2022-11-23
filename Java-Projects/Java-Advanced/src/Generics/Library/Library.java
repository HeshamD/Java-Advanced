package Generics.Library;

// Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
// Provide one version of the class that uses generics and one that does not.
// Feel free to use any additional APIs for storing and retrieving the media.
//

// Media what's sharable among these book,video,newspaper

public interface Library<T>{
    String playAudio();
    String readScripts();
}
