package org.example.observer;

public interface SubjectLibrary {
  void subscribeObserver(Observer ob);
  void unsubscribeObserver(Observer ob);
  void notifyObserver();
}
