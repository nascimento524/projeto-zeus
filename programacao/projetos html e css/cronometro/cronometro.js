let hours = 0;
let minutes = 0;
let seconds = 0;
let interval = null;
let isRunning = false;

// Atualiza o display
function updateDisplay() {
    let formattedHours = hours < 10 ? `0${hours}` : hours;
    let formattedMinutes = minutes < 10 ? `0${minutes}` : minutes;
    let formattedSeconds = seconds < 10 ? `0${seconds}` : seconds;
    
    document.getElementById("display").textContent = `${formattedHours}:${formattedMinutes}:${formattedSeconds}`;
}

// Função para iniciar o cronômetro
function startTimer() {
    if (!isRunning) {
        isRunning = true;
        interval = setInterval(() => {
            seconds++;
            if (seconds === 60) {
                seconds = 0;
                minutes++;
            }
            if (minutes === 60) {
                minutes = 0;
                hours++;
            }
            updateDisplay();
        }, 1000);
    }
}

// Função para pausar o cronômetro
function pauseTimer() {
    clearInterval(interval);
    isRunning = false;
}

// Função para zerar o cronômetro
function resetTimer() {
    clearInterval(interval);
    hours = 0;
    minutes = 0;
    seconds = 0;
    isRunning = false;
    updateDisplay();
}
