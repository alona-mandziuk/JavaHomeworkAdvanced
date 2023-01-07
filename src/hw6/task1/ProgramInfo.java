package hw6.task1;

/**
 * This annotation declares the information about current
 * program: author, date of the release and the version.
 */

@interface ProgramInfo {
    String author();

    String version();

    String date();
}
