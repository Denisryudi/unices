import pyautogui
import time
import keyboard
#mouseinfo  >>> from mouseinfo import mouseInfo   -- mouseInfo()


tempo_inicial = time.time()
limite = 50

duração_do_clique = 1
contador = 0

pyautogui.click(615,1061, duration=duração_do_clique)
while contador <= 20:
    pyautogui.click(749, 349, duration=duração_do_clique)
    pyautogui.click(1221, 615, duration=duração_do_clique)

    time.sleep(1)

    tempo_atual = time.time()
    tempo_decorrido = tempo_atual - tempo_inicial

    # Verifica se o tempo decorrido ultrapassou o limite
    if tempo_decorrido >= limite:
        print("Tempo esgotado!")
        break

    # Verifique se a tecla Esc foi pressionada
    if keyboard.is_pressed('x'):
        break  # Se a tecla Esc for pressionada, saia do loop