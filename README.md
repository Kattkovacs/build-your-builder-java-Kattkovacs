# Build your own builder

## Story

The company has a very strict policy about installing software on
servers. This is both a good security practice and a pain at the same
time. Because you have to [build](https://en.wikipedia.org/wiki/Software_build)
some software on one of your staging servers and no build system is installed.

It's time to get your hands dirty with some task automation work.
You are selected to write a proper script file which automates the build
process of the already done application.
Now you don't have to touch the application source code itself, other developers already
responsible for it, but you should write a
bash
script.

You don't despair. You've been in this situation before. So you
brace yourself and build your own build system with the tools
available.

## What are you going to learn

- Some minimal scripting
- The build pipeline of your chosen programming language

## Tasks


1. Find all source files in the script's directory and compile them.

    - Either
- get them programmatically - or read them from a file - or put them into a variable in your script.
    - Compile the individual Java files into the respective byte-code files. *Watch out:* one source might create more then one output files.

2. The user has an option to set output directory where the compiled files will be located.

    - The first command line argument of the script is taken as an output directory. If I run the script like this: `.\solution "publish"` then all the generated files should be placed in `.\publish` folder.
    - When the first argument is not specified than all generated files should be placed in `.\classes` directory by default..
    - The specified output directory should be cleared out before the new files are placed there.

3. Find a way to tell where the application should start.

    - Configure the `main` method as the entry point of the project.

4. If one of the steps fail then don't try the next one.

    - Write an error message to standard error (file descriptor 2)
    - In case of an error make your builder return with a non-zero status code.

5. The last step of our builder shall be to create a runnable file.

    - Create a `jar` file. Test that you can run the file with `java -jar <filename.jar>`.


## General requirements


 - The provided `solution` builder script file (`.sh`, `.bat`, `.ps1`) is executable. E.g. on Unix it can be run with `./<filename>`.

## Hints

- Do the next step only if the preceding step has succeeded.
- Use environment variables just as you would use variables in your
  programs.
- The included source code is completely irrelevant for the
  completion of the project, however, it is a nice and general
  logger implementation.


## Starting repository

Follow [this link](https://journey.code.cool/v2/project/solo/blueprint/build-your-builder/java) to create your project repository.

## Background materials

- :exclamation: [How to compile and run Java](https://learn.code.cool/full-stack/#/../pages/java/how-to-compile-and-run-java)
- See the manual pages of your compilers / packagers (e.g. `javac(1)` and `jar(1)` for Java)
- [How to get help](https://learn.code.cool/full-stack/#/../pages/unix/help)
- [Using the Unix shell environment](https://learn.code.cool/full-stack/#/../pages/unix/environment)
- [Piping and redirection](https://learn.code.cool/full-stack/#/../pages/unix/piping)
- [Find files in Linux](https://www.linode.com/docs/tools-reference/tools/find-files-in-linux-using-the-command-line/)

