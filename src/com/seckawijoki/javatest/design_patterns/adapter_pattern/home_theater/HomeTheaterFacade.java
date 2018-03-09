package com.seckawijoki.javatest.design_patterns.adapter_pattern.home_theater;

/**
 * Created by 瑶琴频曲羽衣魂 on 2017/5/5.
 */

class HomeTheaterFacade {
  private Amplifier amplifier;
  private Tuner tuner;
  private DVDPlayer dvdPlayer;
  private CDPlayer cdPlayer;
  private Screen screen;
  private TheaterLight theaterLight;
  private Projector projector;
  private PopcornPopper popcornPopper;
  void watchMovie(String movie){
    System.out.println("Get ready to watch a movie...");
    popcornPopper.on();
    popcornPopper.pop();
    theaterLight.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amplifier.on();
    amplifier.setDvd(dvdPlayer);
    amplifier.setSurroundSound();
    amplifier.setVolume(5);
    dvdPlayer.on();
    dvdPlayer.play(movie);
  }
  void endMovie(){
    System.out.println("Shutting movie theater down...");
    popcornPopper.off();
    theaterLight.on();
    screen.up();
    projector.off();
    amplifier.off();
    dvdPlayer.stop();
    dvdPlayer.eject();
    dvdPlayer.off();
  }
  private HomeTheaterFacade(int i){

  }
  HomeTheaterFacade(){
    tuner = new Tuner();
    cdPlayer = new CDPlayer();
    dvdPlayer = new DVDPlayer();
    amplifier = new Amplifier.Builder()
            .setCDPlayer(cdPlayer)
            .setDVDPlayer(dvdPlayer)
            .setTuner(tuner)
            .build();
    tuner.setAmplifier(amplifier);
    cdPlayer.setAmplifier(amplifier);
    dvdPlayer.setAmplifier(amplifier);
    screen = new Screen();
    theaterLight = new TheaterLight();
    projector = new Projector(dvdPlayer);
    popcornPopper = new PopcornPopper();
  }
  static class Builder{
    private HomeTheaterFacade homeTheater;
    Builder(){
      homeTheater = new HomeTheaterFacade(0);
    }
    Builder setAmplifier(Amplifier amplifier){
      homeTheater.amplifier = amplifier;
      return this;
    }
    Builder setTuner(Tuner tuner){
      homeTheater.tuner = tuner;
      return this;
    }
    Builder setCDPlayer(CDPlayer cdPlayer){
      homeTheater.cdPlayer = cdPlayer;
      return this;
    }
    Builder setDVDPlayer(DVDPlayer dvdPlayer){
      homeTheater.dvdPlayer = dvdPlayer;
      return this;
    }
    Builder setScreen(Screen screen){
      homeTheater.screen = screen;
      return this;
    }
    Builder setProjector(Projector projector){
      homeTheater.projector = projector;
      return this;
    }
    Builder setTheaterLight(TheaterLight theaterLight){
      homeTheater.theaterLight = theaterLight;
      return this;
    }
    Builder setPopcornPopper(PopcornPopper popcornPopper){
      homeTheater.popcornPopper = popcornPopper;
      return this;
    }
    HomeTheaterFacade build(){
      return homeTheater;
    }
  }
}
