package com.seckawijoki.javatest.rxjava_text;/*

package com.seckawijoki.javatest.rxjava_text;

import android.util.Log;

import java.util.concurrent.Callable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;



*/
/**
 * Created by 瑶琴频曲羽衣魂 on 2017/6/18.
 *//*



public class RxJavaTest {
  public static final String RX_JAVA = "RxJava";
  private static final String HELLO_WORLD = "HELLO_WORLD";
  public static void main(String[] args) {
    System.out.println(HELLO_WORLD);
//    RxJavaTest rxjavaTest = new RxJavaTest();
//    rxjavaTest.observable();
  }


  public void flowable() {
    //可直接在Logcat控制台输出
    //形式为Log.i("System.out", string);
    Flowable.just(HELLO_WORLD).subscribe(System.out::println);
    //非Lambda表达式的写法
    Flowable.just(HELLO_WORLD).subscribe(new Consumer<String>() {
      @Override
      public void accept(@NonNull String s) throws Exception {
        Log.i("Hello world", s);
      }
    });
  }

  public void observable(){
    Observable.just(HELLO_WORLD)
            .map(s -> s + "-Dan")
            .subscribe(s -> Log.i("Lambda Observable", s));
    Observable.just(HELLO_WORLD)
            .map(String::hashCode)
            .subscribe(s -> Log.i("Lambda Observable", Integer.toString(s)));
    Observable.just(HELLO_WORLD)
            .map(String::hashCode)
            .map(s -> Integer.toString(s))
            .subscribe(s -> Log.i("Lambda Observable", s));
    Observable.just(HELLO_WORLD)
            .map(s -> s + "-Dan")
            .map(String::hashCode)
            .map(s -> Integer.toString(s))
            .subscribe(s -> Log.i("Lambda Observable", s));
  }

  //非Lambda表达式的写法
  public void observable2(){
    Observable.create(new ObservableOnSubscribe<Integer>() {
      @Override
      public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
        for (int i = 0; i < 3; ++i) {
          e.onNext(i);
        }
        e.onComplete();
      }
    }).subscribe(new Observer<Integer>() {
      @Override public void onSubscribe(@NonNull Disposable d) {}
      @Override public void onNext(@NonNull Integer integer) {
        Log.d("Observer", integer + "");
      }
      @Override public void onError(@NonNull Throwable e) {}
      @Override public void onComplete() {
        System.out.println("Hello rxjava execute complete");
      }
    });

    Observable observable = Observable.create((ObservableOnSubscribe<String>) e -> {
      e.onNext(HELLO_WORLD);
      e.onComplete();
    });
    Observer<String> observer = new Observer<String>() {
      @Override public void onSubscribe(@NonNull Disposable d) {}
      @Override public void onNext(@NonNull String s) {
        Log.d("Observer", s);
      }
      @Override public void onError(@NonNull Throwable e) {}
      @Override public void onComplete() { }
    };
    observable.subscribe(observer);
  }

  public void callable() {
    Flowable.fromCallable(() -> {
      Thread.sleep(1000);
      return "Done";
    })
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.single())
            .subscribe(s -> Log.d("Callable", s), Throwable::printStackTrace);
    //非Lambda表达式的写法
    Flowable.fromCallable(new Callable<String>() {
      @Override
      public String call() throws Exception {
        Thread.sleep(1000);
        return "Done";
      }
    })
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.single())
            .subscribe(new Consumer<String>() {
              @Override
              public void accept(@NonNull String x) throws Exception {
                Log.d("Callable", x);
              }
            }, new Consumer<Throwable>() {
              @Override
              public void accept(@NonNull Throwable throwable) throws Exception {
                throwable.printStackTrace();
              }
            });

  }
}

*/
