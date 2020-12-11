function nextFibonacci(n) {
    if(Math.sqrt(5*n*n + 4) % 1 === 0 || Math.sqrt(5*n*n - 4) % 1 === 0){ // Check if input is a fibonacci number
        return Math.round(n * (1 + Math.sqrt(5)) / 2);
    } else {
        return "Not a fibonacci number!";
    }
}