# Internal Ticket Management System

Project Context
The hypothetical company wishes to implement an internal tool that allows employees to submit support tickets (IT, HR, administrative). This system should enable agents to process incoming requests, administrators to oversee and manage everything and a smooth interface for all users. The application should be scalable, maintainable and adaptable to complex organizational structures.

“As I’m working alone on this project, all microservices will initially be developed within a single mono-repository for simplicity.”

## Objectives
Centralize all internal support requests
Improve ticket tracking and status visibility
Reduce resolution time
Ensure traceability and accountability

## User Roles
Employee: Submit and tracks their tickets
Support Agent: Handles and resolves tickets assigned to their department
Administrator: Oversees all tickets, manages users and departments

### Key Features
### MVP Features
Authentication and authorization
Ticket creation and editing
Assignment based on department
Ticket status updates (e.g., Open, In Progress, Resolved)
Notifications (email or system-based)
Support dynamic department creation and configuration

### Advanced / Future Features
Allow each department to define its own ticket processing logic (manual assignment, auto-assign, open pool..)
Ensure department-specific workflows remain scalable and easy to extend
Support hierarchical team structures within large departments (e.g., leads, sub-teams and routing rules)
Allow flexible ticket assignment strategies
Support restricted or scoped admin access to specific departments, for confidentiality (e.g., HR) and organizational separation


## User Stories
All users
- As a user, I want to log in using my credentials, so that I can access my account and data.
- As a user, I want to stay logged in for a session, so that I don't have to re-authenticate constantly.
- As a user, I want to log out, so that my session is closed and my data remains secure.

Employee
- As an employee, I want to create a support ticket, so that I can request help from the appropriate team.
- As an employee, I want to view the list of my submitted tickets, so that I can track their progress.
- As an employee, I want to edit a ticket I submitted if it hasn’t been processed yet, so that I can update the information.
- As an employee, I want to receive a notification when my ticket is updated, so that I stay informed of its status.

Support Agent
- As a support agent, I want to view all unassigned tickets in my department, so that I can choose which ones to handle.
- As a support agent, I want to assign a ticket to myself, so that I can start working on it.
- As a support agent, I want to update a ticket's status, so that the requester knows its progress.
- As a support agent, I want to filter tickets by priority or submission date, so that I can manage them efficiently.

Administrator
- As an administrator, I want to manage user accounts, so that only authorized employees have access and are correctly assigned.
- As an administrator, I want to manage users and assign them to departments, so that each ticket is routed correctly.
- As an administrator, I want to create and configure departments, so that the system remains flexible.
- As an administrator, I want to view and manage all tickets across departments, so that I can oversee operations.
- As an administrator, I want to define the assignment strategy for each department (manual, auto-assign, open pool), so that tickets follow the right workflow.
- As an administrator, I want to have scoped access to specific departments when needed, so that sensitive data (e.g., HR tickets) is not globally exposed
- As an administrator, I want to see an audit log of ticket updates and user actions, so that all operations are traceable.
- As an administrator, I want to configure department-specific ticket categories and priorities, so that the system adapts to different workflows.