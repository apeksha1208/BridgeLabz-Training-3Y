const fs = require('fs');
fs.readFile('input.txt', (err, data) => {
    if (err) {
        console.error('Error reading file', err.message);
        return;
    }
    const words = data.trim();
});
