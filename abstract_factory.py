from abc import ABC, abstractmethod

class Button(ABC):
      @abstractmethod
      def criar():
            pass

class WindowsButton(Button):
      def criar(self):
            return "Criou um botão Windows"

class LinuxButton(Button):
      def criar(self):
            return "Criou um botão Linux"

class PopUp(ABC):
      @abstractmethod
      def criar():
            pass

class WindowsPopUp(PopUp):
      def criar(self):
            return "Criou um pop up Windows"

class LinuxPopUp(PopUp):
      def criar(self):
            return "Criou um pop up Linux"

class UIElementsFactory(ABC):
      @abstractmethod
      def create_button(self):
            pass

      @abstractmethod
      def create_pop_up(self):
            pass

class ElementsWindows(UIElementsFactory):
      def create_button(self):
            return WindowsButton()
      
      def create_pop_up(self):
            return WindowsPopUp()

class ElementsLinux(UIElementsFactory):
      def create_button(self):
            return LinuxButton()
      
      def create_pop_up(self):
            return LinuxPopUp()

if __name__ == "__main__":
      factory = ElementsLinux()
      button = factory.create_button()
      popUp = factory.create_pop_up()
      print(button.criar())
      print(popUp.criar())